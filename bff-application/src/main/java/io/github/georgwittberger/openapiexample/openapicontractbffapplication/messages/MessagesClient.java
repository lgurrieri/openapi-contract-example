package io.github.georgwittberger.openapiexample.openapicontractbffapplication.messages;

import io.github.georgwittberger.openapiexample.openapicontractmicroserviceapplication.api.client.MessagesApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("messages")
public interface MessagesClient extends MessagesApi {
}
