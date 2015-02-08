package com.example.ikhwan.islammics.Helper;


import java.io.Serializable;
import android.R.string;
/**
 * Created by Ikhwan on 2/3/2015.
 */
public class Comic implements Serializable{

        string id;
        int imageId;
        String title;
        public string getId() {
            return id;
        }
        public void setId(string id) {
            this.id = id;
        }
        public int getImageId() {
            return imageId;
        }
        public void setImageId(int id) {
            this.imageId = id;
        }
        public String getTitle() {
            return title;
        }
        public void setTitle(String string) {
            this.title = string;
        }

}
