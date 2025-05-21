**EndUser** - This service will consume location update

#Start Zookeeper Server 
bin\windows\zookeeper-server-start.bat config\zookeeper.properties

Start Kafka Server
bin\windows\kafka-server-start.bat config\server.properties

Create new topic
kafka-topics.bat --create --topic <topic-name> --bootstrap-server localhost:9092

Produce new topic
bin\windows\kafka-console-producer.bat --topic <topic-name> --bootstrap-server localhost:9092

consume new topic
bin\windows\kafka-console-consumer.bat --topic <topic-name> --from-beginning --bootstrap-server localhost:9092

List all the topics
bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092

Describe particular topic
bin\windows\kafka-topics.bat --describe --bootstrap-server localhost:9092 --topic <topic-name>
