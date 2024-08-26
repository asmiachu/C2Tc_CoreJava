package com.tnsif.pm.placement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PlacementService 
{
	@Autowired
	private  PlacementRepository repo;
	
	public List<Placement>listAll()
	{
		return repo.findAll();
	}
	public Placement get(Long id)
	{
		return repo.findById(id).get();
	}
	public void save(Placement placement) 
	{
		// TODO Auto-generated method stub
		 repo.save(placement);
	}
	/*public void delete()
	{
		repo.deleteAll();
		//repo.deleteById(Long sid);
	}*/
	
	public void deleteById(Long id) 
	{
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
	
}
