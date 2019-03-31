package com.viksuutechie.spring.boot.data.jpa.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viksuutechie.spring.boot.data.jpa.dto.LaptopDTO;
import com.viksuutechie.spring.boot.data.jpa.mapper.LaptopMapper;
import com.viksuutechie.spring.boot.data.jpa.model.Laptop;
import com.viksuutechie.spring.boot.data.jpa.repository.LaptopRepository;

@Service
public class LaptopService {

	@Autowired
	private LaptopRepository lapRepo;
	
	@Autowired
	private LaptopMapper mapper;
	
	@Transactional
	public List<LaptopDTO> createLaptop(List<LaptopDTO> laptopDtos) {
		
		List<Laptop> laps = new ArrayList<>() ;
		if(laptopDtos != null) {
			
			List<Laptop> laptops = mapper.toLaptopList(laptopDtos);
			for(Laptop l: laptops) {
				laps.add(lapRepo.saveAndFlush(l));
			}
		}
		
		return mapper.toLaptopDTOList(laps);
	}

}
