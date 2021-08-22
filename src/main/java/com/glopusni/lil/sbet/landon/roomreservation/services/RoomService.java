package com.glopusni.lil.sbet.landon.roomreservation.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import com.glopusni.lil.sbet.landon.roomreservation.models.Room;
import java.util.List;

@Service
public class RoomService {
    
    private static final List<Room> rooms = new ArrayList<>();    

    static {
        for(int i=0; i<=10; i++){
            rooms.add(new Room(i, "Room "+i, "R"+i, "Q"));
        }
    }

    public List<Room> getAllRooms(){
        return rooms;
    }
}
