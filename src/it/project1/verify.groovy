/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

String buildLog = new File(basedir, 'build.log').text

assert buildLog.contains('''[ERROR] ValidationViolation: "sling-repoinit: Invalid repoinit statement(s) detected: Encountered " <STRING> "invalid "" at line 2, column 1.
Was expecting:
    <EOF> 
    ", filePath=''' + "src${File.separator}main${File.separator}jcr_root${File.separator}apps${File.separator}test${File.separator}config${File.separator}org.apache.sling.jcr.repoinit.RepositoryInitializer~test1.config")
assert buildLog.contains('''[ERROR] ValidationViolation: "sling-repoinit: Invalid repoinit statement(s) detected: Encountered " <STRING> "invalid "" at line 1, column 1.
Was expecting:
    <EOF> 
    ", filePath=''' + "src${File.separator}main${File.separator}jcr_root${File.separator}apps${File.separator}test${File.separator}config${File.separator}org.apache.sling.jcr.repoinit.RepositoryInitializer~test2.cfg.json")
assert buildLog.contains('''[ERROR] ValidationViolation: "sling-repoinit: Invalid repoinit statement(s) detected: Encountered " <STRING> "invalid "" at line 1, column 1.
Was expecting:
    <EOF> 
    ", filePath=''' + "src${File.separator}main${File.separator}jcr_root${File.separator}apps${File.separator}test${File.separator}config${File.separator}org.apache.sling.jcr.repoinit.RepositoryInitializer~test3.cfg")
assert buildLog.contains('[ERROR] Failed to execute goal org.apache.jackrabbit:filevault-package-maven-plugin:1.3.0:validate-files (default-validate-files) on project org.apache.sling.repoinit.filevault.validator.project1: Found 3 violation(s) (with severity=ERROR). Check above errors for details -> [Help 1]')