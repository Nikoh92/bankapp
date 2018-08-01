package junit;

import com.nhe.bankapp.domain.Client;
import org.junit.Test;


import static org.junit.Assert.assertTrue;

public class ClientTest {

    private Client client;
    
    @Test
    public void client_shloud_have_been_created(){
        this.client = new Client("Pierre-Jean");

        assertTrue(client.getFirstName().equals("Pierre-Jean"));
    }
}
