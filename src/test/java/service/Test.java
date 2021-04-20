package service;

import exeption.AnimalErrorCode;
import exeption.AnimalException;
import model.Animal;
import org.junit.Assert;

import java.util.Map;

public class Test {
    ServiceForTest serviceForTest = new ServiceForTest();
    DataForTest dataForTest = new DataForTest();

    @org.junit.Test
    public void testCalculation() {
        serviceForTest.writeDataToFile(dataForTest.fileAnimal, dataForTest.animal);
        Map<String, Integer> resultMap = Calculation.calculation(dataForTest.fileLogic, dataForTest.fileAnimal);
        Integer resultValue = resultMap.get("плотоядное ");
        Assert.assertEquals(resultValue, new Integer(1));

        resultValue = resultMap.get("маленькое невысокое всеядное ");
        Assert.assertEquals(resultValue, new Integer(1));

        resultValue = resultMap.get("травоядное ");
        Assert.assertEquals(resultValue, new Integer(1));

        resultValue = resultMap.get("маленькое травоядное плотоядное ");
        Assert.assertEquals(resultValue, new Integer(0));
    }

    @org.junit.Test
    public void testCheckQuantityProperties() {
        String message;
        try {
            CheckProperty.checkQuantityProperties(dataForTest.animalErrorEmptyProperty);
        } catch (AnimalException e) {
            Assert.assertEquals(e.getMessage(), AnimalErrorCode.WRONG_QUANTITY_PROPERTIES.getErrorString());
        }
    }

    @org.junit.Test
    public void testCheckEmptyProperties() {
        try {
            CheckProperty.checkEmptyProperties(dataForTest.animalErrorEmptyProperty);
        } catch (AnimalException e) {
            Assert.assertEquals(e.getMessage(), AnimalErrorCode.EMPTY_PROPERTY.getErrorString());
        }
    }

    @org.junit.Test
    public void testCheckAllProperties() {
        try {
            CheckProperty.checkAllProperties(dataForTest.animalErrorWrongProperty);
        } catch (AnimalException e) {
            Assert.assertEquals(e.getMessage(), AnimalErrorCode.WRONG_PROPERTY.getErrorString());
        }
    }
}
