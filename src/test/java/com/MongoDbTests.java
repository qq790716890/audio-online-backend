package com;

import com.audioOnline.AudioApplication;
import com.mongodb.client.*;
import org.bson.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = AudioApplication.class)
public class MongoDbTests {
    MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

    MongoDatabase database = mongoClient.getDatabase("myMongoDb");

    @Test
    public void mongoDBStart(){

//        mongoClient.listDatabaseNames().forEach(System.out::println);
//
//        database.createCollection("customers");
//
//        database.listCollectionNames().forEach(System.out::println);


        MongoCollection<Document> collection = database.getCollection("customers");
//        Document document = new Document();
//        document.put("name", "Shubham");
//        document.put("company", "Baeldung");
//        collection.insertOne(document);
//        collection.find().forEach(System.out::println);
//
//
//        Document query = new Document();
//        query.put("name", "Shubham");
//
//        Document newDocument = new Document();
//        newDocument.put("name", "John");
//
//        Document updateObject = new Document();
//        updateObject.put("$set", newDocument);
//
//        collection.updateOne(query, updateObject);

//        collection.find().forEach(System.out::println);


        // 查询
        Document searchQuery = new Document();
        searchQuery.put("name", "John");
        FindIterable<Document> cursor = collection.find(searchQuery);

        try (final MongoCursor<Document> cursorIterator = cursor.cursor()) {
            while (cursorIterator.hasNext()) {
                System.out.println(cursorIterator.next());
            }
        }



    }

}
