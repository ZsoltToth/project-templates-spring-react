import React from "react";
import {Formik} from "formik";
import * as Yup from "yup";

const Login = () => (
    <Formik
        initialValues={{email: "", password: ""}}
        onSubmit={(values, {setSubmitting}) => {
            setTimeout(() => {
                //LoginActions.login(values);
                console.log("Ámen");
                setSubmitting(false);
            }, 500);
        }}

        validationSchema={Yup.object().shape({
            email: Yup.string()
                .email()
                .required("Email megadása kötelező"),
            password: Yup.string()
                .required("Nem lehet üres!")
        })}
    >
        {props => {
            const {
                values,
                touched,
                errors,
                isSubmitting,
                handleChange,
                handleBlur,
                handleSubmit
            } = props;
            return (
                <form onSubmit={handleSubmit}>
                    <div className="form-group">
                        <label htmlFor="email">Email</label>
                        <input
                            name="email"
                            type="text"
                            placeholder="Add meg az email címed"
                            value={values.email}
                            onChange={handleChange}
                            onBlur={handleBlur}
                            className={ errors.email && touched.email ? "form-control is-invalid" : "form-control"}
                        />
                        {errors.email && touched.email && (
                            <div className={"invalid-feedback"}>{errors.email} </div>
                        )}
                    </div>
                    <div className={"form-group"}>
                        <label htmlFor="email">Jelszó</label>
                        <input
                            name="password"
                            type="password"
                            placeholder="Add meg a jelszavad"
                            value={values.password}
                            onChange={handleChange}
                            onBlur={handleBlur}
                            className={errors.password && touched.password ? "form-control is-invalid" : "form-control"}
                        />
                        {errors.password && touched.password && (
                            <div className={"invalid-feedback"}>{errors.password}</div>
                        )}
                    </div>
                    <button type="submit" disabled={isSubmitting} className={"btn btn-primary"}>
                        Bejelentkezés
                    </button>
                </form>
            );
        }}
    </Formik>
);
export default Login;