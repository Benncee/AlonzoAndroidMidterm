package com.alonzo.animal.midterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.content.Intent

class AnimalNamesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_names)

        val btnManageBlockAnimals = findViewById<Button>(R.id.btnManageBlockAnimals)
        btnManageBlockAnimals.setOnClickListener {
            // Intent to start ManageBlockActivity
            val intent = Intent(this, ManageBlockActivity::class.java)
            startActivity(intent)
        }

        // Retrieve the animal names array from strings.xml
        val animalNames = resources.getStringArray(R.array.animal_names)

        // Initialize the ListView and ArrayAdapter
        val listView = findViewById<ListView>(R.id.lvAnimalNames)
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, animalNames)

        // Set the adapter to the ListView
        listView.adapter = adapter
    }
}

class ManageBlockActivity {

}
