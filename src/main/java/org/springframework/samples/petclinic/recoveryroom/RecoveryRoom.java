package org.springframework.samples.petclinic.recoveryroom;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import org.springframework.samples.petclinic.model.NamedEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name="recoveryroom")
public class RecoveryRoom extends NamedEntity{
    
	
	@PositiveOrZero
    private Double size;
    
    @NotEmpty
    Boolean secure;
    
    @ManyToOne(optional=false)
    RecoveryRoomType roomType;
    
    
    public Boolean isSecure() {
    	return secure;
    }
    

}