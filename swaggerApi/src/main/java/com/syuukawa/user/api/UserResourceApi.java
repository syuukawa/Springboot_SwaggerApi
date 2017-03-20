/**
 * Spring Boot + Jersey + Swagger + Docker Example
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.syuukawa.user.api;

import com.syuukawa.user.invoker.ApiCallback;
import com.syuukawa.user.invoker.ApiClient;
import com.syuukawa.user.invoker.ApiException;
import com.syuukawa.user.invoker.ApiResponse;
import com.syuukawa.user.invoker.Configuration;
import com.syuukawa.user.invoker.Pair;
import com.syuukawa.user.invoker.ProgressRequestBody;
import com.syuukawa.user.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import com.syuukawa.user.entity.ResponseString;

import java.lang.reflect.Type;

public class UserResourceApi {
    private ApiClient apiClient;

    public UserResourceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserResourceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getUserDetail */
    private com.squareup.okhttp.Call getUserDetailCall(Long userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/user/detail".replaceAll("\\{format\\}","json");

        java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));

        java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();

        java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * /detail
     * get userDetail by userId
     * @param userId  (optional)
     * @return ResponseString
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResponseString getUserDetail(Long userId) throws ApiException {
        ApiResponse<ResponseString> resp = getUserDetailWithHttpInfo(userId);
        return resp.getData();
    }

    /**
     * /detail
     * get userDetail by userId
     * @param userId  (optional)
     * @return ApiResponse&lt;ResponseString&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseString> getUserDetailWithHttpInfo(Long userId) throws ApiException {
        com.squareup.okhttp.Call call = getUserDetailCall(userId, null, null);
        Type localVarReturnType = new TypeToken<ResponseString>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /detail (asynchronously)
     * get userDetail by userId
     * @param userId  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserDetailAsync(Long userId, final ApiCallback<ResponseString> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getUserDetailCall(userId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseString>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}