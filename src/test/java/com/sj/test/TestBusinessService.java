/**
 * 
 */
package com.sj.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.runners.MockitoJUnitRunner;

import com.sj.repository.DataService;
import com.sj.service.BusinessService;

/**
 * @author skumari96
 *
 */


@SuppressWarnings("deprecation")
@RunWith(MockitoJUnitRunner.class)
public class TestBusinessService {

	@InjectMocks
	BusinessService numService = new BusinessService();
	
	@Mock
	DataService dataService;
	
	@Test
	public void testFindGreatestNumber() {
		
		
		when(dataService.retrieveAllData()).thenReturn(new int[] {24,15,56,30});
		assertEquals(56,numService.findGreatestNumber());
	
	}

}
