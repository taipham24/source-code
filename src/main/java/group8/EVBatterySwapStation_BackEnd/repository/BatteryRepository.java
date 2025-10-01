package group8.EVBatterySwapStation_BackEnd.repository;

import group8.EVBatterySwapStation_BackEnd.entity.Battery;
import group8.EVBatterySwapStation_BackEnd.entity.Station;
import group8.EVBatterySwapStation_BackEnd.enums.BatteryStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BatteryRepository extends JpaRepository<Battery, Long> {
    List<Battery> findByStationAndStatus(Station station, BatteryStatus status);

    List<Battery> findByStation_StationIdAndStatus(Long stationId, BatteryStatus status);

    List<Battery> findByStation_StationId(Long stationId);

    Optional<Battery> findFirstByStationAndStatus(Station station, BatteryStatus status);

    long countByStationAndStatus(Station station, BatteryStatus status);
}
