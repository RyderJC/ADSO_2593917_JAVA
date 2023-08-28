<?php  
    $dataHeader['titulo'] = "Ver Usuarios";

    $this->load->view('layouts/header', $dateHeader);
?>
    <?php  
        $dataSidebar['session'] = $session;
        $dataSidebar['optionSelected'] = 'openCreateUser';
        $this->load->view('layouts/sidebear', $dateSidebar);
    ?>
<div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <div class="col-12 m-0 p-3">
            <h1 class="text-primary text-center" >Formulario creacion</h1>
        </div>
</div>
    <?php  
        
        $this->load->view('layouts/footer');    
    ?>