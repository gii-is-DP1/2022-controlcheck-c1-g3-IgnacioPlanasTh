package org.springframework.samples.petclinic.recoveryroom;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.samples.petclinic.recoveryroom.RecoveryRoom;

public interface RecoveryRoomRepository extends CrudRepository<RecoveryRoom,Integer>{
    List<RecoveryRoom> findAll();
    
    Optional<RecoveryRoom> findById(int id);
    
    @SuppressWarnings("unchecked")
	RecoveryRoom save(@Valid RecoveryRoom p);
    
    @Query("SELECT rrt FROM RecoveryRoomType rrt")
    List<RecoveryRoomType> findAllRecoveryRoomTypes();
    
    @Query("SELECT rrt FROM RecoveryRoomType rrt where rrt.name= :name")
    RecoveryRoomType getRecoveryRoomType(String name);
}
