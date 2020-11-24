from time import sleep
from json import dumps
from kafka import KafkaProducer
import requests
import os

kafkaPort = os.environ['KAFKA_PORT']
exchangePort = os.environ['EXCHANGE_PORT']
print("kafkaPort", kafkaPort)
print("exchangePort", exchangePort)
producer = KafkaProducer(
    bootstrap_servers=[kafkaPort+':9092'],
    value_serializer=lambda x: dumps(x).encode('utf-8')
)
for j in range(9999):
    r =requests.get('http://'+exchangePort+':5000/btc-price')
    print("Iteration", r.text)
    print("kafkaPort", kafkaPort)
    print("exchangePort", exchangePort)
    producer.send('btc-price', value=r.text)
    sleep(10)
    
