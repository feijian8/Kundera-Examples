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

import com.impetus.kundera.examples.cli.HBaseCli;


/**
 * Test case for Twitter like application on HBase
 * 
 * @author amresh.singh
 */
public class TwibaseTest extends TwitterTestBase
{  

    @Override
    protected void setUp() throws Exception
    {
        setUpInternal("twihbase");
    }

    /**
     * Test on execute.
     */
    public void testOnExecute()
    {
        executeTestSuite();
    }


    @Override
    protected void tearDown() throws Exception
    {
        tearDownInternal();
    } 
    
    @Override
    void startServer()
    {
        if (!HBaseCli.isStarted())
        {            
            HBaseCli.startCluster();           
        }
    }

    @Override
    void stopServer()
    {
        if (HBaseCli.isStarted())
        {            
            HBaseCli.stopCluster();           
        }
    }    
    

    @Override
    void createSchema()
    {
        /*if(AUTO_MANAGE_SCHEMA) {
            String tableName = "USER";
            HBaseCli.createTable(tableName);
            HBaseCli.addColumnFamily(tableName, "ADDRESS");
            HBaseCli.addColumnFamily(tableName, "PERSONNEL");
        }*/
        
    }

    @Override
    void deleteSchema()
    {
    }

    
    
}
