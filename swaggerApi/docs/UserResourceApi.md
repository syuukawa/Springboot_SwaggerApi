# UserResourceApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserDetail**](UserResourceApi.md#getUserDetail) | **GET** /user/detail | /detail


<a name="getUserDetail"></a>
# **getUserDetail**
> ResponseString getUserDetail(userId)

/detail

get userDetail by userId

### Example
```java
// Import classes:
//import com.syuukawa.user.invoker.ApiException;
//import com.syuukawa.user.api.UserResourceApi;


UserResourceApi apiInstance = new UserResourceApi();
Long userId = 789L; // Long | 
try {
    ResponseString result = apiInstance.getUserDetail(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserResourceApi#getUserDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**|  | [optional]

### Return type

[**ResponseString**](ResponseString.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

