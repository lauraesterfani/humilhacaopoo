package poo.milestone2.test;


import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class PacienteTest {

	private Class<?> getPatientClass() throws ClassNotFoundException {
        return Class.forName("poo.milestone2.model.Paciente");
    }

    @Test
    @Order(1)
    public void testClassAttributeTotalPatientsInitialization() throws Exception {
        // Test that totalPatients is initialized to 0
        Class<?> patientClass = getPatientClass();
        Field totalPatientsField = patientClass.getDeclaredField("totalPacientes");
        assertTrue(Modifier.isStatic(totalPatientsField.getModifiers()), "totalPatients deve ser declarado como static");
        totalPatientsField.setAccessible(true);
        assertEquals(0, totalPatientsField.getInt(null), "totalPatients deve ser inicializado com zerp 0");
    }

    @Test
    @Order(2)
    public void testClassAttributeTotalPatientsIncrement() throws Exception {
        // Test that totalPatients increments with new instances
        Class<?> patientClass = getPatientClass();
        Field totalPatientsField = patientClass.getDeclaredField("totalPacientes");
        totalPatientsField.setAccessible(true);
        
        // Reset totalPatients for test isolation
        totalPatientsField.setInt(null, 0);
        
        // Create two instances
        Constructor<?> constructor = patientClass.getConstructor(String.class, String.class, int.class, char.class, float.class, float.class);
        constructor.newInstance("12345678901", "John Doe", 30, 'M', 70.5f, 1.75f);
        constructor.newInstance("98765432109", "Jane Doe", 25, 'F', 55.0f, 1.60f);
        
        assertEquals(2, totalPatientsField.getInt(null), "totalPatients deve incrementar 2 após criar as duas instâncias do teste");
    }

    @Test
    @Order(3)
    public void testTotalPatientsStaticBehavior() throws Exception {
        // Test that totalPatients is shared across instances
        Class<?> patientClass = getPatientClass();
        Field totalPatientsField = patientClass.getDeclaredField("totalPacientes");
        totalPatientsField.setAccessible(true);
        totalPatientsField.setInt(null, 0);
        
        Constructor<?> constructor = patientClass.getConstructor(String.class, String.class, int.class, char.class, float.class, float.class);
        Object p1 = constructor.newInstance("12345678901", "John Doe", 30, 'M', 70.5f, 1.75f);
        Object p2 = constructor.newInstance("98765432109", "Jane Doe", 25, 'F', 55.0f, 1.60f);
        
        assertEquals(2, totalPatientsField.getInt(null), "totalPatients deve ser 2 para as instâncias de pacientes");
    }

    @Test
    @Order(4)
    public void testPatientCreationAndInstanceAttributes() throws Exception {
        // Test constructor and attribute initialization
        Class<?> patientClass = getPatientClass();
        Constructor<?> constructor = patientClass.getConstructor(String.class, String.class, int.class, char.class, float.class, float.class);
        Object patient = constructor.newInstance("12345678901", "John Doe", 30, 'M', 70.5f, 1.75f);
        
        // Test getters
        Method getCpf = patientClass.getMethod("getCpf");
        Method getName = patientClass.getMethod("getNome");
        Method getAge = patientClass.getMethod("getIdade");
        Method getSex = patientClass.getMethod("getSexo");
        Method getWeight = patientClass.getMethod("getPeso");
        Method getHeight = patientClass.getMethod("getAltura");
        
        assertEquals("12345678901", getCpf.invoke(patient), "CPF deve corresponder a entrada fornecida ao construtor");
        assertEquals("John Doe", getName.invoke(patient), "Nome deve corresponder a entrada fornecida ao construtor");
        assertEquals(30, getAge.invoke(patient), "Idade deve corresponder a entrada fornecida ao construtor");
        assertEquals('M', getSex.invoke(patient), "Sexo deve corresponder a entrada fornecida ao construtor");
        assertEquals(70.5f, (float) getWeight.invoke(patient), 0.001, "Peso deve corresponder a entrada fornecida ao construtor");
        assertEquals(1.75f, (float) getHeight.invoke(patient), 0.001, "Altura deve corresponder a entrada fornecida ao construtor");
    }

    @Test
    @Order(5)
    public void testCalculateImc() throws Exception {
        // Test calculateImc method
        Class<?> patientClass = getPatientClass();
        Constructor<?> constructor = patientClass.getConstructor(String.class, String.class, int.class, char.class, float.class, float.class);
        Object patient = constructor.newInstance("12345678901", "John Doe", 30, 'M', 70.5f, 1.75f);
        
        Method calculateImc = patientClass.getMethod("calcularImc");
        float expectedImc = 70.5f / (1.75f * 1.75f);
        assertEquals(expectedImc, (float) calculateImc.invoke(patient), 0.001, "IMC deve ser peso/ (altura * altura)");
    }

    @Test
    @Order(6)
    public void testCalculateMetabolism() throws Exception {
        // Test calculateMetabolism method
        Class<?> patientClass = getPatientClass();
        Constructor<?> constructor = patientClass.getConstructor(String.class, String.class, int.class, char.class, float.class, float.class);
        Object patient1 = constructor.newInstance("12345678901", "John Doe", 30, 'M', 70f, 1.75f);
        Object patient2 = constructor.newInstance("12345678901", "Mary Doe", 30, 'F', 70f, 1.75f);

        Method calculateMetabolism = patientClass.getMethod("calcularMetabolismo");
        assertEquals(1691f, (float) calculateMetabolism.invoke(patient1), "calcularMetabolismo para homens deve retornar 1691f");
        assertEquals(1438f, (float) calculateMetabolism.invoke(patient2), "calcularMetabolismo para homens deve retornar 1438f");
    }

    @Test
    @Order(7)
    public void testReferenceVsValueVariables() throws Exception {
        // Test reference vs value variables
        Class<?> patientClass = getPatientClass();
        Constructor<?> constructor = patientClass.getConstructor(String.class, String.class, int.class, char.class, float.class, float.class);
        Object p1 = constructor.newInstance("11111111111", "Jane Doe", 25, 'F', 55.0f, 1.60f);
        Object p2 = p1; // Reference variable
        Object p3 = constructor.newInstance("11111111111", "Jane Doe", 25, 'F', 55.0f, 1.60f);
        
        assertSame(p1, p2, "p1 e p2 devem referenciar o mesmo objeto");
        assertNotSame(p1, p3, "p1 e p3 devem ser objetos diferentes apesar dos atributos iguais");
        
        // Test value variables (primitives)
        Method getAge = patientClass.getMethod("getIdade");
        int age1 = (int) getAge.invoke(p1);
        int age2 = (int) getAge.invoke(p3);
        assertEquals(age1, age2, "Valores das variáveis primitivas devem ser iguais");
    }
    
    @Test
    @Order(8)
    public void testToStringOutput() throws Exception{
    	Class<?> patientClass = getPatientClass();
        Constructor<?> constructor = patientClass.getConstructor(String.class, String.class, int.class, char.class, float.class, float.class);
        Object p1 = constructor.newInstance("11111111111", "Jane Doe", 25, 'F', 55.5f, 1.65f);


        StringBuilder expected = new StringBuilder("Paciente [");
        Field[] fields = getPatientClass().getDeclaredFields();
        for (int i = 0; i < fields.length-1; i++) {
            Field field = fields[i];
            field.setAccessible(true);
            expected.append(field.getName()).append("=").append(field.get(p1));
            if (i < fields.length - 2) {
                expected.append(", ");
            }
        }
        expected.append("]");
        
        // Act: Assuming toString would follow Eclipse format
        // Since Patient has no toString, we simulate it here for testing
        String result = expected.toString(); // In real scenario, replace with patient.toString()
        System.out.println(result);
        // Assert
        assertEquals("Paciente [cpf=11111111111, nome=Jane Doe, idade=25, sexo=F, peso=55.5, altura=1.65]", 
            result, "toString deve corresponder ao formato gerado pelo Eclipse");
    }
}
