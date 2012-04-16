/*
 * Copyright 2011 Impetus Infotech.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.impetus.kundera.examples.twitter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

import com.impetus.kundera.examples.cli.CassandraCli;

/**
 * Test case for Cassandra.
 * 
 * @author amresh.singh
 */
public class TwissandraTest extends TwitterTestBase
{

    /** The Constant LOG. */
    private static final Log LOG = LogFactory.getLog(TwissandraTest.class);    
    
    @BeforeClass
    public static void init() throws Exception
    {
        //Start Cassandra Server
        if (RUN_IN_EMBEDDED_MODE)
        {
            CassandraCli.cassandraSetUp();
        }          
    }
    
    @Before
    protected void setUp() throws Exception
    {       
        setUpInternal("secIdxCassandra");       
    }

    /**
     * Test on execute.
     */
    public void testOnExecute() throws Exception
    {
       executeTestSuite();       
    }

    
    

    @After
    protected void tearDown() throws Exception
    {
        tearDownInternal();        
    }     
    
    
    @Override
    void createSchema()
    {        
        
    }

    @Override
    void deleteSchema() 
    {
       /* LOG.warn("Truncating Column families and finally dropping Keyspace KunderaExamples in Cassandra....");
        CassandraCli.dropColumnFamily("USER", "KunderaExamples");
        CassandraCli.dropColumnFamily("PREFERENCE", "KunderaExamples");
        CassandraCli.dropColumnFamily("EXTERNAL_LINKS", "KunderaExamples");
        CassandraCli.dropKeySpace("KunderaExamples");*/
    }
    
    
}
