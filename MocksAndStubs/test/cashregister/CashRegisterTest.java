package cashregister;

import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CashRegisterTest {

    @Mock
    Printer mockPrinter;

    @Test
    public void shouldPrintNameOfItem(){
        Printer mockPrinter = mock(Printer.class);
        StubPurchase stubPurchase = new StubPurchase("item one");
        new CashRegister(mockPrinter).process(stubPurchase);
        verify(mockPrinter).print("item one");
    }
}