package com.viksuutechie.spring.boot.data.jpa.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.viksuutechie.spring.boot.data.jpa.dto.LaptopDTO;
import com.viksuutechie.spring.boot.data.jpa.model.Laptop;

@Mapper(componentModel = "spring")
public interface LaptopMapper {

/*	LaptopDTO laptopToLaptopDTO(Laptop laptop);

	Laptop laptopDTOToLaptop(LaptopDTO laptopDTO);

	List<Laptop> LaptopDTOList2LaptopList(List<LaptopDTO> laptopDTO);

	List<LaptopDTO> LaptopList2LaptopDTOList(List<Laptop> laptop);
	
*/
	
	LaptopDTO toLaptopDTO(Laptop laptop);
	Laptop toLaptop(LaptopDTO laptopDto);
	List<Laptop> toLaptopList(List<LaptopDTO> laptopDtos);
	List<LaptopDTO> toLaptopDTOList(List<Laptop> laptops);
}
