import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './front/Home/home.component';
import { SingInComponent } from './front/Authentication/sing-in/sing-in.component';
import { DashboardComponent } from './back/dashboard/dashboard.component';
import { CreateprojetComponent } from './front/Projet/createprojet/createprojet.component';
import { ViewprojetComponent } from './front/Projet/viewprojet/viewprojet.component';
import { UpdateprojetComponent } from './front/Projet/updateprojet/updateprojet.component';

const routes: Routes = [
  {
    path:'',component:HomeComponent,
  },
  {
    path:'login',component:SingInComponent
  },
  {
    path:'createproject',component:CreateprojetComponent
  },
  {
    path:'projectlist',component:ViewprojetComponent
  },
 {
    path: 'dashboard',
    loadChildren: () => import('./back/back.module').then(m => m.BackModule)
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
