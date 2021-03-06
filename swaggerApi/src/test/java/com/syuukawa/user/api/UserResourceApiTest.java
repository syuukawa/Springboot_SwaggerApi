/**
 * Spring Boot + Jersey + Swagger + Docker Example
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 * <p>
 * OpenAPI spec version: v1
 * <p>
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.syuukawa.user.api;

import com.syuukawa.user.entity.ResponseString;
import com.syuukawa.user.invoker.ApiException;
import org.junit.Test;


/**
 * API tests for UserResourceApi
 */
public class UserResourceApiTest {

    private final UserResourceApi api = new UserResourceApi();


    /**
     * /detail
     *
     * get userDetail by userId
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserDetailTest() throws ApiException {
        Long userId = 123L;
        ResponseString response = api.getUserDetail(userId);
        System.out.println("===========" + response);
        // TODO: test validations
    }

}
