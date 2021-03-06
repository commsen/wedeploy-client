package com.commsen.wedeploy.client;

import com.commsen.wedeploy.client.cloud.WeDeployStatusService;
import com.commsen.wedeploy.client.data.WeDeployDataService;

import aQute.bnd.annotation.headers.BundleCategory;
import aQute.bnd.annotation.headers.BundleDevelopers;
import aQute.bnd.annotation.headers.BundleDocURL;
import aQute.bnd.annotation.headers.Category;
import aQute.bnd.annotation.licenses.ASL_2_0;

@ASL_2_0
@BundleCategory(value=Category.clients)
@BundleDevelopers(name="Milen Dyankov", value="milendyankov@gmail.com")
@BundleDocURL("https://github.com/azzazzel/wedeploy-client/tree/master/java-client#comcommsenwedeployclient")
public class WeDeployClient {

	SPI spi = new SPI();


	public WeDeployDataService data() throws WeDeployClientException {
		
		return spi.wire(WeDeployDataService.class);
	}

	public WeDeployStatusService status() throws WeDeployClientException {
		
		return spi.wire(WeDeployStatusService.class);
		
	}

}
