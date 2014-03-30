package org.wiztools.stagen;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author subwiz
 */
public class JsonDataLoaderTest {
    
    public JsonDataLoaderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getData method, of class JsonDataLoader.
     */
    @Test
    public void testGetData() throws Exception {
        System.out.println("getData");
        File dataFile = new File("src/test/resources/master.json");
        DataLoader instance = ServiceLocator.getInstance(DataLoader.class);
        
        Map<String, Object> expResult = new HashMap<>();
        expResult.put("name", "Aarthi");
        expResult.put("spouse", "Subhash");
        List<String> interests = new ArrayList<>();
        interests.add("love");
        interests.add("sex");
        interests.add("dance");
        expResult.put("interests", interests);
        
        Map<String, Object> result = instance.getData(dataFile);
        assertEquals(expResult, result);
    }
    
}
