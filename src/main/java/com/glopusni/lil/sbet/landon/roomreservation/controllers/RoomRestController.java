package com.glopusni.lil.sbet.landon.roomreservation.controllers;

import com.glopusni.lil.sbet.landon.roomreservation.models.Room;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glopusni.lil.sbet.landon.roomreservation.services.RoomService;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {
	private final RoomService roomService;

	public RoomRestController(RoomService roomService) {
		super();
		this.roomService = roomService;
	}
	
	@GetMapping
	public List<Room> getAllRooms() {
		return roomService.getAllRooms();
	}
}
