package com.example.ikhwan.islammics; /**
 * Created by Ikhwan on 2/3/2015.
 */

import java.util.List;

import com.example.ikhwan.islammics.Helper.Comic;
import com.example.ikhwan.islammics.R.id;
//import com.example.ikhwan.islammics.models.Tweet;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ComicAdapter extends ArrayAdapter{
    LayoutInflater inflater;
    public List<Comic> comics;


    public ComicAdapter(Activity activity, List<Comic> comics){
        super(activity, R.layout.single_comic_grid, comics);
        inflater = activity.getWindow().getLayoutInflater();

        this.comics = comics;
    }

    public ComicAdapter(Activity activity) {
        super(activity, R.layout.single_comic_grid);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        if (convertView == null){
            convertView = inflater.inflate(R.layout.single_comic_grid, parent, false);
        }

        TextView title = (TextView) convertView.findViewById(R.id.grid_text);
        title.setText(comics.get(position).getTitle());

        ImageView thumbnail = (ImageView)convertView.findViewById(id.grid_image);
        thumbnail.setImageResource(comics.get(position).getImageId());

        return convertView;
    }


}
