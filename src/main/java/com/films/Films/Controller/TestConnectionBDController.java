package com.films.Films.Controller;


import com.mongodb.client.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path = "/test")
public class TestConnectionBDController {

    @GetMapping("/mongo")
    public String testConnection() {
        String connectionString = System.getenv("mongoUriFilms");
        MongoClient mc;
        try {
            mc = MongoClients.create(connectionString);
            mc.getDatabase("sample_mix");
        } catch (Exception e) {
            return "message: test error";

        }

        return "message: test succesfull";

    }
}


//            List<Document> databases = mc.listDatabases().into(new ArrayList<>());
//            databases.forEach(db -> System.out.println(db.toJson()));