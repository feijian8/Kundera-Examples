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

import java.io.IOException;

import org.apache.cassandra.thrift.InvalidRequestException;
import org.apache.cassandra.thrift.SchemaDisagreementException;
import org.apache.cassandra.thrift.TimedOutException;
import org.apache.cassandra.thrift.UnavailableException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.thrift.TException;
import org.junit.After;
import org.junit.Before;

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
    void startServer()
    {
        try
        {
            CassandraCli.cassandraSetUp();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (TException e)
        {
            e.printStackTrace();
        }
        catch (InvalidRequestException e)
        {
            e.printStackTrace();
        }
        catch (UnavailableException e)
        {
            e.printStackTrace();
        }
        catch (TimedOutException e)
        {
            e.printStackTrace();
        }
        catch (SchemaDisagreementException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    void stopServer()
    {
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
