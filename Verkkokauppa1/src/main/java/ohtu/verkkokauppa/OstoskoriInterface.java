/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.verkkokauppa;

/**
 *
 * @author hexvaara
 */
public interface OstoskoriInterface
{

    int hinta();

    void lisaa(TuoteInterface t);

    void poista(TuoteInterface t);
    
}
