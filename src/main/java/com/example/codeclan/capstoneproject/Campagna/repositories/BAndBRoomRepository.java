package com.example.codeclan.capstoneproject.Campagna.repositories;

import com.example.codeclan.capstoneproject.Campagna.accomodations.models.BAndBRoom;
import com.example.codeclan.capstoneproject.Campagna.accomodations.models.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BAndBRoomRepository extends JpaRepository<BAndBRoom, Long> {
    List<BAndBRoom> findByRoomType(RoomType roomType);
}
