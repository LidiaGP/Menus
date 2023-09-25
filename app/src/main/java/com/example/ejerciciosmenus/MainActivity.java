package com.example.ejerciciosmenus;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText edt_nombre;
    EditText edt_telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_nombre=findViewById(R.id.edt_nombre);
        edt_telefono =findViewById(R.id.edt_telefono);
        registerForContextMenu(edt_nombre);
        registerForContextMenu(edt_telefono);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mi_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        switch (item.getItemId()){
            case R.id.menu_salir:finish(); return true;
        }
        return false;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        if(v.getId()== R.id.edt_nombre){
            getMenuInflater().inflate(R.menu.menu_contextual,menu);
        }
        else if(v.getId()== R.id.edt_telefono){
            getMenuInflater().inflate(R.menu.menu_contextual2,menu);
        }

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        AdapterView.AdapterContextMenuInfo infoView = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();

        switch (item.getItemId()){
            case R.id.copiar:break;
            case R.id.llamar:break;
            case R.id.borrar: borrarCaja((int) infoView.id);break;
            case R.id.borrar2:borrarCaja((int) infoView.id); break;

        }
        return true;
    }

    void borrarCaja(int idCaja) {
        EditText caja = findViewById(idCaja);
        caja.setText("");
    }


}

