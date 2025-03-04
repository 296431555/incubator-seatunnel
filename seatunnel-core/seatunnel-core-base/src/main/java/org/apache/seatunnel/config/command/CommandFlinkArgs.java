/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.seatunnel.config.command;

import com.beust.jcommander.Parameter;

public class CommandFlinkArgs {

    @Parameter(names = {"-c", "--config"},
        description = "config file",
        required = true)
    private String configFile = "application.conf";

    @Parameter(names = {"-i", "--variable"},
        description = "variable substitution, such as -i city=beijing, or -i date=20190318")
    private String variable = null;

    @Parameter(names = {"-t", "--check"},
        description = "check config")
    private boolean testConfig = true;

    public String getConfigFile() {
        return configFile;
    }

    public boolean isTestConfig() {
        return testConfig;
    }

}
