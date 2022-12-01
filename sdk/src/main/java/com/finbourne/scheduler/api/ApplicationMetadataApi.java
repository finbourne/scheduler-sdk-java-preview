/*
 * FINBOURNE Scheduler API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.671
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.scheduler.api;

import com.finbourne.scheduler.ApiCallback;
import com.finbourne.scheduler.ApiClient;
import com.finbourne.scheduler.ApiException;
import com.finbourne.scheduler.ApiResponse;
import com.finbourne.scheduler.Configuration;
import com.finbourne.scheduler.Pair;
import com.finbourne.scheduler.ProgressRequestBody;
import com.finbourne.scheduler.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.finbourne.scheduler.model.LusidProblemDetails;
import com.finbourne.scheduler.model.ResourceListOfAccessControlledResource;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationMetadataApi {
    private ApiClient localVarApiClient;
    public ApplicationMetadataApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApplicationMetadataApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for listAccessControlledResources
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listAccessControlledResourcesCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/metadata/access/resources";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.0.671");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listAccessControlledResourcesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listAccessControlledResourcesCall(_callback);
        return localVarCall;

    }

    /**
     * [EXPERIMENTAL] ListAccessControlledResources: Get resources available for access control
     * Get the comprehensive set of resources that are available for access control
     * @return ResourceListOfAccessControlledResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfAccessControlledResource listAccessControlledResources() throws ApiException {
        ApiResponse<ResourceListOfAccessControlledResource> localVarResp = listAccessControlledResourcesWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] ListAccessControlledResources: Get resources available for access control
     * Get the comprehensive set of resources that are available for access control
     * @return ApiResponse&lt;ResourceListOfAccessControlledResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfAccessControlledResource> listAccessControlledResourcesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = listAccessControlledResourcesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<ResourceListOfAccessControlledResource>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] ListAccessControlledResources: Get resources available for access control (asynchronously)
     * Get the comprehensive set of resources that are available for access control
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listAccessControlledResourcesAsync(final ApiCallback<ResourceListOfAccessControlledResource> _callback) throws ApiException {
        okhttp3.Call localVarCall = listAccessControlledResourcesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<ResourceListOfAccessControlledResource>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
