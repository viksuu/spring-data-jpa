
package com.viksuutechie.spring.boot.data.jpa.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.viksuutechie.spring.boot.data.jpa.dto.VehicleDTO;
import com.viksuutechie.spring.boot.data.jpa.model.Vehicle;

/**
 * @author vkumar
 *
 */

@Mapper(componentModel="spring")
public interface VehicleMapper {


	VehicleDTO bikeToBikeDTO(Vehicle bike);

	Vehicle bikeDTOToBike(VehicleDTO bikeDTO);

	List<VehicleDTO> listBikeToBikeDTO(List<Vehicle> bikes);
	
	List<Vehicle> listBikeDTOToBike(List<VehicleDTO> bikesDto);
	
	/*
    @Override
    default BikeDTO bikeToBikeDTO(Bike bike) {
        if ( bike == null ) {
            return null;
        }

        BikeDTO bikeDTO = new BikeDTO();

        bikeDTO.setName( bike.getName() );
        bikeDTO.setCreated_date( bike.getCreated_date() );
        bikeDTO.setUpdated_date( bike.getUpdated_date() );
        List<Bike> list = bike.getBike();
        if ( list != null ) {
            bikeDTO.setBike(       new ArrayList<Bike>( list )
            );
        }
        List<Address> list_ = bike.getAddress();
        if ( list_ != null ) {
            bikeDTO.setAddress(       new ArrayList<Address>( list_ )
            );
        }

        return bikeDTO;
    }

    @Override
    default Bike bikeDTOToBike(BikeDTO bikeDTO) {
        if ( bikeDTO == null ) {
            return null;
        }

        Bike bike = new Bike();

        bike.setCreated_date( bikeDTO.getCreated_date() );
        bike.setUpdated_date( bikeDTO.getUpdated_date() );
        List<Address> list = bikeDTO.getAddress();
        if ( list != null ) {
            bike.setAddress(       new ArrayList<Address>( list )
            );
        }
        List<Bike> list_ = bikeDTO.getBike();
        if ( list_ != null ) {
            bike.setBike(       new ArrayList<Bike>( list_ )
            );
        }

        return bike;
    }

    @Override
    default List<BikeDTO> listBikeToBikeDTO(List<Bike> bikes) {
        if ( bikes == null ) {
            return null;
        }

        List<BikeDTO> list = new ArrayList<BikeDTO>();
        for ( Bike bike : bikes ) {
            list.add( bikeToBikeDTO( bike ) );
        }

        return list;
    }*/
}