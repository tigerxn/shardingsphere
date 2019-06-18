/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
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
 * </p>
 */

package io.shardingsphere.shardingui.common.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * Sharding UI system exception.
 *
 * @author chenqingyang
 */
@Getter
@Setter
public final class ShardingUIException extends RuntimeException {
    
    public static final int INVALID_PARAM = 400;
    
    public static final int NO_RIGHT = 403;
    
    public static final int SERVER_ERROR = 500;
    
    private final int errCode;
    
    private final String errMsg;
    
    public ShardingUIException(final int errCode, final String errMsg) {
        super(errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }
    
}
