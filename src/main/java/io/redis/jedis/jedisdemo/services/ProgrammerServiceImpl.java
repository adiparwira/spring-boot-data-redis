package io.redis.jedis.jedisdemo.services;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.redis.jedis.jedisdemo.dao.ProgrammerRepository;
import io.redis.jedis.jedisdemo.model.Programmer;

@Service
public class ProgrammerServiceImpl implements ProgrammerService {
	
	@Autowired
	private ProgrammerRepository repository;

	@Override
	public void setProgrammerAsString(String idKey, String programmer) {
		this.repository.setProgrammerAsString(idKey, programmer);
	}

	@Override
	public String getProgrammerAsString(String key) {
		return this.repository.getProgrammerAsString(key);
	}

	@Override
	public void AddToProgrammersList(Programmer programmer) {
		repository.AddToProgrammersList(programmer);
		
	}

	@Override
	public List<Programmer> getProgrammersListMembers() {		
		return repository.getProgrammersListMembers();
	}

	@Override
	public Long getProgrammersListCount() {		
		return repository.getProgrammersListCount();
	}

	@Override
	public void AddToProgrammersSet(Programmer... programmers) {
		this.repository.AddToProgrammersSet(programmers);
		
	}

	@Override
	public Set<Programmer> getProgrammersSetMembers() {		
		return this.repository.getProgrammersSetMembers();
	}

	@Override
	public boolean isSetMember(Programmer programmer) {		
		return this.repository.isSetMember(programmer);
	}

	@Override
	public void savePHash(Programmer programmer) {
		this.repository.saveHash(programmer);
		
	}

	@Override
	public void updatePHash(Programmer programmer) {
		this.repository.updateHash(programmer);
		
	}

	@Override
	public Map<Integer, Programmer> findAllPHash() {		
		return this.repository.findAllHash();
	}

	@Override
	public Programmer findPInHash(int id) {		
		return this.repository.findInHash(id);
	}

	@Override
	public void deletePhash(int id) {
		this.repository.deleteHash(id);		
	}
}
