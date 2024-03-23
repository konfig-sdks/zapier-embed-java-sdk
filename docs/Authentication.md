

# Authentication

An Authentication contains various fields, often credentials such as API tokens, used to access Partner APIs on behalf of a user. The actual fields are held securely by Zapier.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** |  |  |
|**type** | **String** | The type of this object. |  [readonly] |
|**id** | **String** |  |  |
|**app** | **Object** |  |  |
|**isExpired** | **Boolean** | If &#x60;true&#x60;, this Authentication has expired. It will not be usable, and the user needs to be directed to reconnect it. |  [readonly] |



