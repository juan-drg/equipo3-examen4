package com.everis.quotationrestservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.everis.quotationrestservice.requests.CotizacionRequest;
import com.everis.quotationrestservice.requests.CotizacionResponse;

@FeignClient(name = "COMPUTERESTSERVICE")
@RibbonClient(name = "COMPUTERESTSERVICE")
public interface CalcularProxy {

	@PostMapping("/cotizacion")
	public CotizacionResponse retrieveCotizacion(@RequestBody CotizacionRequest cotizacion);
}
