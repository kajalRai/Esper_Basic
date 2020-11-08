package config;

import com.espertech.esper.common.client.configuration.Configuration;

public class EsperConfig {

	public static void main(String[] args) {
	  try
	  {
		 Configuration configuration = new Configuration();
		 configuration.addEventType("DebitMoney",events.DebitMoney.class.getName());
	  }

	}

}
