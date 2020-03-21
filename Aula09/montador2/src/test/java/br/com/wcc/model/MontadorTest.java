package br.com.wcc.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MontadorTest {


    @Mock
    CriadorPlaca criadorPlaca;

    @InjectMocks
    private Montador montador;


    @Test
    public void montarPlacasOk() {
        // pre-requisitos
        final int numPlacas = 3;
        final Placa placa = mock(Placa.class);
        when(criadorPlaca.criarPlaca()).thenReturn(placa);
        doNothing().when(placa).addComponente(any());

        // oq eu vou testar
        final List<Placa> resultado = montador.montarPlacas(numPlacas);

        // verificar resultado
        assertNotNull(resultado);
        assertEquals(numPlacas, resultado.size());
    }

    @Test
    public void montarPlacasNotOk() {
        // pre-requisitos
        final int numPlacas = 30;
        final Placa placa = mock(Placa.class);
        when(criadorPlaca.criarPlaca()).thenReturn(placa);
        doThrow(IllegalArgumentException.class).when(placa).addComponente(any());

        // oq eu vou testar
        final List<Placa> resultado = montador.montarPlacas(numPlacas);

        // verificar resultado
        assertNotNull(resultado);
        assertEquals(numPlacas, resultado.size());
        for (Placa placaResultado : resultado) {
            assertEquals(0, placaResultado.getComponentes().size());
        }
    }
}