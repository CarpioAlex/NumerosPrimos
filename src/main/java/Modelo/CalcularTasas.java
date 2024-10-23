/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import MARSHAL.*;
/**
 *
 * @author alexc
 */
public class CalcularTasas {
      public Tax calcularTax(String taxTypeCode, double taxRate, double taxableBaseAmount) {
        // Crear el objeto TaxableBase y asignarle el valor de la base imponible
        TaxableBase taxableBase = new TaxableBase();
        taxableBase.setTotalAmount(taxableBaseAmount);

        // Calculo aqui
        double taxAmountValue = taxableBaseAmount * (taxRate / 100);

        // Instanciar y asignar
        TaxAmount taxAmount = new TaxAmount();
        taxAmount.setTotalAmount(taxAmountValue);

        // Crear el objeto Tax y asignar todos sus valores
        Tax tax = new Tax();
        tax.setTaxTypeCode(taxTypeCode); // Código del tipo de impuesto
        tax.setTaxRate(taxRate);         // Tasa del impuesto
        tax.setTaxableBase(taxableBase); // Base imponible
        tax.setTaxAmount(taxAmount);     // PRECIO CALCULADO

        // Devolver el objeto Tax calculado
        return tax;
    }
}

