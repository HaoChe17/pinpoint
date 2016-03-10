/**
 * Copyright 2014 NAVER Corp.
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
 */
package com.navercorp.pinpoint.plugin.hystrix;

import com.navercorp.pinpoint.common.trace.AnnotationKey;
import com.navercorp.pinpoint.common.trace.AnnotationKeyFactory;
import com.navercorp.pinpoint.common.trace.ServiceType;
import com.navercorp.pinpoint.common.trace.ServiceTypeFactory;

/**
 * @author Jiaqi Feng
 *
 */
public interface HystrixPluginConstants {
    // TODO I just add offset to each constants below, while these should be changed laterly after consideration
    static final int OFFSET=2;
    //TODO it seems no need for hystrix server & client type
    public static final ServiceType HYSTRIX_SERVICE_TYPE = ServiceTypeFactory.of(9120, "HYSTRIX_COMMAND");
    public static final AnnotationKey ANNOTATION_KEY_HYSTRIX_VALUE = AnnotationKeyFactory.of(998+OFFSET, "HYSTRIXValue");

    public static final AnnotationKey HYSTRIX_RPC_ARGUMENT_ANNOTATION_KEY = AnnotationKeyFactory.of(995+OFFSET, "HYSTRIX_ARGUMENT");
    public static final AnnotationKey HYSTRIX_RPC_PROCEDURE_ANNOTATION_KEY = AnnotationKeyFactory.of(996+OFFSET, "HYSTRIX_PROCEDURE");
    public static final AnnotationKey HYSTRIX_RPC_RESULT_ANNOTATION_KEY = AnnotationKeyFactory.of(997+OFFSET, "HYSTRIX_RESULT");

    public static final String META_DO_NOT_TRACE = "_Hystrix_DO_NOT_TRACE";
    public static final String META_TRANSACTION_ID = "_Hystrix_TRASACTION_ID";
    public static final String META_SPAN_ID = "_Hystrix_SPAN_ID";
    public static final String META_PARENT_SPAN_ID = "_Hystrix_PARENT_SPAN_ID";
    public static final String META_PARENT_APPLICATION_NAME = "_Hystrix_PARENT_APPLICATION_NAME";
    public static final String META_PARENT_APPLICATION_TYPE = "_Hystrix_PARENT_APPLICATION_TYPE";
    public static final String META_FLAGS = "_Hystrix_FLAGS";

}
