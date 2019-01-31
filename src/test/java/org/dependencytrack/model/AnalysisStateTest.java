/*
 * This file is part of Dependency-Track.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright (c) Steve Springett. All Rights Reserved.
 */
package org.dependencytrack.model;

import org.junit.Assert;
import org.junit.Test;

public class AnalysisStateTest { 

    @Test
    public void testEnums() {
        Assert.assertEquals("NOT_SET", AnalysisState.NOT_SET.name());
        Assert.assertEquals("IN_TRIAGE", AnalysisState.IN_TRIAGE.name());
        Assert.assertEquals("NOT_AFFECTED", AnalysisState.NOT_AFFECTED.name());
        Assert.assertEquals("FALSE_POSITIVE", AnalysisState.FALSE_POSITIVE.name());
        Assert.assertEquals("NOT_AFFECTED", AnalysisState.NOT_AFFECTED.name());
    }

} 
