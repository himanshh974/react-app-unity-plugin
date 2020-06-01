using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class UnityJavaPlugin : MonoBehaviour
{
    public Text myText;
  
    public void changedTextToFuck(string value)
    {
        myText.text = value;
    }
   
    
}
