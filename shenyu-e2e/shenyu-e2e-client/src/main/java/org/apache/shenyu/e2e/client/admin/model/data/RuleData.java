/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shenyu.e2e.client.admin.model.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;
import lombok.Data;
import org.apache.shenyu.e2e.client.admin.model.MatchMode;
import org.apache.shenyu.e2e.client.admin.model.handle.RuleHandle;
import org.apache.shenyu.e2e.common.IdManagers.Selectors;

import java.io.IOException;
import java.util.List;

@Data
@Builder(toBuilder = true)
public class RuleData implements ResourceData {
    
    private String id;
    
    private String name;
    
    private String selectorId;
    
    @JsonProperty("loged")
    private boolean logged;
    
    private MatchMode matchMode;
    
    private int sort;
    
    @JsonSerialize(using = RuleHandle.Serializer.class)
    private RuleHandle handle;
    
    @JsonProperty("ruleConditions")
    private List<Condition> conditionList;
    
    private boolean enabled;
    
}