package bz.nils.dev.va19.shop.component.behaviour;

import bz.nils.dev.va19.shop.connector.CustomerRestConnectorRequester;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class CustomerShopServiceTest {

    @Mock
    private CustomerRestConnectorRequester customerRestConnectorRequester;

    @InjectMocks
    private CustomerShopService customerShopService;

    @Test
    public void testCreateNewCustomer() {
        String expectedCustomerId = "a668f13e-770c-4336-be39-1988abec066e";
        Mockito.when(customerRestConnectorRequester.createCustomer(Mockito.any(Object.class))).thenReturn(expectedCustomerId);
        Object customer = new Object();
        String newCustomerId = customerShopService.createNewCustomer(customer);
        Assert.assertEquals(expectedCustomerId, newCustomerId);
    }
}
