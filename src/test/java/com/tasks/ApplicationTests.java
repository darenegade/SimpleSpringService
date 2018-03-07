package com.tasks;

import com.tasks.model.Employee;
import com.tasks.repositories.EmployeeRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	private static UUID uuid = UUID.randomUUID();

	@Before
	public void setUp() {
		Employee e = new Employee();
		e.setOid(uuid);
		e.setName("Hans");

		employeeRepository.save(e);
	}

	@After
	public void tearDown(){
		employeeRepository.deleteAll();
	}

	@Test
	public void canFindWithNewID() {

		Employee savedE = employeeRepository.findAll().iterator().next();
		assertNotNull(employeeRepository.findOne(savedE.getOid()));

		assertEquals(1, employeeRepository.findAll().spliterator().estimateSize());

	}

	@Test
	public void cantFindWithSetUUID() {

		assertNull(employeeRepository.findOne(uuid));

	}

}
