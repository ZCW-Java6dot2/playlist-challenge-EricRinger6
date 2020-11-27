package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(playList));

        Integer up = list.indexOf(selection) - startIndex;//Iterating up would be focused on the first instance of selection
        Integer down = startIndex + (list.size() - list.lastIndexOf(selection));//Iteration down would be focused on the last instance of selection

        if(up < down){
            return up;
        }
        return down;
    }
}
