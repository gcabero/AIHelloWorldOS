package models;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.mongojack.JacksonDBCollection;
import org.mongojack.DBQuery;
import org.mongojack.ObjectId;
import play.modules.mongojack.KeyTyped;
import play.modules.mongojack.MongoDB;

public class Photo implements KeyTyped<String> {


    @ObjectId
    @JsonProperty("_id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("base64Image")
    public String imageInBinaryFormat;
    @JsonProperty("album")
    public String album;

    private static JacksonDBCollection<Photo, String> db() {
        return MongoDB.getCollection("photos", Photo.class);
    }



    public static Photo findByName (String nameP){
        return db().findOne(DBQuery.is("name", nameP));
    }


}
